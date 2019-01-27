package com.example.form;

import java.io.Serializable;

public class SampleUserForm  implements Serializable {

    /** serialVersionUID. */
    private static final long serialVersionUID = 1L;

    /** ユーザ情報ID。 */
    private String userId;

    /** 漢字氏名。 */
    private String kanjiName;

    /** かな氏名。 */
    private String kanaName;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getKanjiName() {
        return kanjiName;
    }

    public void setKanjiName(String kanjiName) {
        this.kanjiName = kanjiName;
    }

    public String getKanaName() {
        return kanaName;
    }

    public void setKanaName(String kanaName) {
        this.kanaName = kanaName;
    }

}
