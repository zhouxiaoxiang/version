# Oriole

[![Dream Begins](https://github.com/zhouxiaoxiang/version/actions/workflows/maven.yml/badge.svg?branch=main)](https://github.com/zhouxiaoxiang/version/actions/workflows/maven.yml)

[English](README.md), [日本語](README.ja.md), [简体中文](README.zh-cn.md)

A unified java api version management module of SpringCloud-based microservices.

## Demo

<script id="asciicast-420152" src="https://asciinema.org/a/420152.js" async></script>

## Usage

### pom.xml

```xml
<dependency>
    <groupId>top.zhouxiaoxiang</groupId>
    <artifactId>oriole</artifactId>
    <version>1.0.0</version>
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
