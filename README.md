# Oriole

[English](README.md), [日本語](README.ja.md), [简体中文](README.zh-cn.md)

A unified java api version management module of SpringCloud-based microservices.

## usage

### pom.xml

```xml
<dependency>
    <groupId>top.zhouxiaoxiang</groupId>
    <artifactId>oriole</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```

### controller 

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

### navigate
  
- right

`http://localhost:8080/v2/`

- wrong
  
`http://localhost:8080/v1/`
