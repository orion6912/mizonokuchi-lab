# mizonokuchi-lab

Javaのフレームワーク "Spring Boot" の学習のためのお試しプロジェクトです。

## Environment

* Java1.8
* SpringBoot2.0．0
* H2Database/postgres
* Doma/MyBatis/SpringDataJPA/DBflute

### Doma/MyBatis/JPA Project

* H2Databaseのインメモリ機能を使用
    * アプリケーション起動時に、src/main/resources配下のSQLファイルが実行されます。
        * このファイルを修正、追加することでDBに多様性を持たせることが可能です。
* /customers アクセスで一覧取得
* /customers/{id} アクセスで一件取得

### DBflute Project
* 外部DB接続あり（postgres）
    * 接続したい方はご連絡下さい。（要グローバルIP）
* 認証機能付き
    * ログイン/アウト、ユーザー登録が可能です。
* view表示機能付き