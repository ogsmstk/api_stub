# APIスタブの説明

java ,spring boot

ローカルのみで使用。
Jsonを返すためのAPIのみ実装。

APIには以下のURLでアクセスする。ポートを変える場合は読み替えること。
URL:http://localhost:8080/stub?stubType={スタブタイプ}

スタブタイプ：返り値のJsonを表す種別をあらわす数値

例：
リクエスト
http://localhost:8080/stub?stubType=1

レスポンス(stub/json/serviceList.json)

```
[{"id":1,"title":"犬","content":"わんわん"},{"id":2,"title":"ひよこ","content":"ぴよぴよ"},{"id":3,"title":"猫","content":"にゃあにゃあ"},{"id":4,"title":"牛","content":"もうもう"},{"id":5,"title":"豚","content":"ぶうぶう"},{"id":6,"title":"羊","content":"めーめー"}]
```

以下にjsonファイルを配置し、対応したスタブ対応をリクエストパラメータに与えることで、
配置したJsonを取得する。
api_stub/src/main/resources/stub/json/

# スタブタイプとJsonの対応
スタブタイプとJsonの対応は以下参照

com/myapp/api/enums/StubType.java
