# Oriole

[English](README.md), [日本語](README.ja.md), [简体中文](README.zh-cn.md)

業界で比較的成熟したソリューションである統合Javaインターフェイスバージョン管理モジュール。

## 使用説明

### 依存

```xml
<dependency>
    <groupId>top.zhouxiaoxiang</groupId>
    <artifactId>oriole</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```

### コントローラ

```java
@RestController
@RequestMapping
@V(2)
public class DemoController {
    @GetMapping
    public String get() {
        return "";
    }
}
```

### テスト
 
- 正しいバージョン

`http://localhost:8080/v2/`

- 間違ったバージョン
  
`http://localhost:8080/v1/`
