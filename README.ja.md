# Oriole

[![Dream Begins](https://github.com/zhouxiaoxiang/version/actions/workflows/maven.yml/badge.svg?branch=main)](https://github.com/zhouxiaoxiang/version/actions/workflows/maven.yml)

[English](README.md), [日本語](README.ja.md), [简体中文](README.zh-cn.md)

業界で比較的成熟したソリューションである統合Javaインターフェイスバージョン管理モジュール。

## デモ

[![](https://asciinema.org/a/420152.svg)](https://asciinema.org/a/420152?autoplay=1)

## 使用説明

### 依存

```xml
<dependency>
    <groupId>top.zhouxiaoxiang</groupId>
    <artifactId>oriole</artifactId>
    <version>1.0.0</version>
</dependency>
```

### コントローラ

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

### テスト
 
- 正しいバージョン

`http://localhost:8080/v2/`

- 間違ったバージョン
  
`http://localhost:8080/v1/`
