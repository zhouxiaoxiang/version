# Oriole

[![Dream Begins](https://github.com/zhouxiaoxiang/version/actions/workflows/maven.yml/badge.svg?branch=main)](https://github.com/zhouxiaoxiang/version/actions/workflows/maven.yml)

[English](README.md), [日本語](README.ja.md), [简体中文](README.zh-cn.md)

業界で比較的成熟したソリューションである統合Javaインターフェイスバージョン管理モジュール。

## デーモン

[![](https://asciinema.org/a/420152.svg)](https://asciinema.org/a/420152?autoplay=1)

## 手順

### pom.xmlの内に下記を追記する。

```xml
<dependency>
    <groupId>top.zhouxiaoxiang</groupId>
    <artifactId>oriole</artifactId>
    <version>1.1.1</version>
</dependency>
```

### コントローラのクラス

3行目の@V(2) アノテーションを利用する。

コントローラーは単純化ブール値 true を返します。

```java
@RestController
@RequestMapping
@V(2)
public class DemoController {
    @GetMapping
    public Boolean get() {
        return true;
    }
}
```

### 実行して確認する

これで「http://localhost:8080/v2/」にアクセスすると「true」が表示されます。

また上記の場合は「http://localhost:8080/v1/」にアクセスするとBad Requestエラーが発生します。
 
- 正しいバージョン

`http://localhost:8080/v2/`

- 間違ったバージョン
  
`http://localhost:8080/v1/`
