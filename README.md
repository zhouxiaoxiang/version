# Oriole

[![Dream Begins](https://github.com/zhouxiaoxiang/version/actions/workflows/maven.yml/badge.svg?branch=main)](https://github.com/zhouxiaoxiang/version/actions/workflows/maven.yml)

[English](README.md), [日本語](README.ja.md), [简体中文](README.zh-cn.md)

A unified java api version management module of SpringCloud-based microservices.

[![Stargazers repo roster for @zhouxiaoxiang/version](https://reporoster.com/stars/zhouxiaoxiang/version)](https://github.com/zhouxiaoxiang/version/stargazers)

## Demo

[![](https://asciinema.org/a/420152.svg)](https://asciinema.org/a/420152?autoplay=1)

## Usage

### pom.xml

```xml
<dependency>
    <groupId>top.zhouxiaoxiang</groupId>
    <artifactId>oriole</artifactId>
    <version>1.1.1</version>
</dependency>
```

### controller 

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

### navigate
  
- right

`http://localhost:8080/v2/`

- wrong
  
`http://localhost:8080/v1/`
