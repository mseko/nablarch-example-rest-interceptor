# nablarch-example-rest-interceptor
## 概要
自作Interceptorの動作確認用プロジェクト

## 使用フレームワーク
- Nablarch 5u13  
  RESTfulウェブサービス

## 作成したアプリについて
### 自作Interceptor
com.example.interceptor.InterceptorExample

### Interceptorを使用しているクラス
com.example.SampleAction

## Interceptor動作確認方法

1. com.example.interceptor.InterceptorExampleの任意の場所にブレークポイントを設定後、以下を実行する。  
   `mvn waitt:run-headless`
2. ChromeのRestlet Client 等でリクエストを送る。

## 参考

### リソース(アクション)クラスのメソッドのシグネチャ
- https://nablarch.github.io/docs/LATEST/doc/application_framework/application_framework/web_service/rest/feature_details/resource_signature.html#rest-feature-details-method-signature

### Interceptorについて
- https://nablarch.github.io/docs/LATEST/doc/application_framework/application_framework/nablarch/architecture.html#interceptor
- https://nablarch.github.io/docs/LATEST/javadoc/nablarch/fw/Interceptor.Factory.html