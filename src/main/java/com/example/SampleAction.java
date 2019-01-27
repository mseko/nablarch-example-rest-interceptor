package com.example;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.example.dto.SampleUserListDto;
import com.example.entity.SampleUser;

import com.example.form.SampleUserForm;
import com.example.interceptor.InterceptorExample;
import nablarch.common.dao.EntityList;
import nablarch.common.dao.UniversalDao;
import nablarch.fw.web.HttpRequest;
import nablarch.fw.web.HttpResponse;

/**
 * 疎通確認用のアクションクラス。
 */
public class SampleAction {

    /**
     * 検索処理。
     * <p>
     * 応答にJSONを使用する。
     * </p>
     * @param req HTTPリクエスト
     * @return ユーザ情報(JSON)
     */
    @Produces(MediaType.APPLICATION_JSON)
    @InterceptorExample
    public EntityList<SampleUser> findProducesJson(HttpRequest req) {
        return UniversalDao.findAll(SampleUser.class);
    }

    @Consumes(MediaType.APPLICATION_JSON)
    @Valid
    @InterceptorExample
    public HttpResponse saveJson(SampleUserForm project) {
        return new HttpResponse(HttpResponse.Status.CREATED.getStatusCode());
    }


    /**
     * 検索処理。
     * <p>
     * 応答にXMLを使用する。
     * </p>
     * @param req HTTPリクエスト
     * @return ユーザ情報(XML)
     */
    @Produces(MediaType.APPLICATION_XML)
    public SampleUserListDto findProducesXml(HttpRequest req) {
        EntityList<SampleUser> sampleUserList = UniversalDao.findAll(SampleUser.class);
        return new SampleUserListDto(sampleUserList);
    }

}
