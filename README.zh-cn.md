# Oriole

[![Dream Begins](https://github.com/zhouxiaoxiang/version/actions/workflows/maven.yml/badge.svg?branch=main)](https://github.com/zhouxiaoxiang/version/actions/workflows/maven.yml)

[English](README.md), [日本語](README.ja.md), [简体中文](README.zh-cn.md)

统一的java接口版本管理模块，一个行内成熟方案。

## 效果

[![asciicast](https://asciinema.org/a/13q2sOH658UvUr4jtuX9RWq2C.svg)](https://asciinema.org/a/13q2sOH658UvUr4jtuX9RWq2C)

## 用法

### 依赖

```xml
<dependency>
    <roupId>top.zhouxiaoxiang</groupId>
    <artifactId>oriole</artifactId>
    <version>1.0.0</version>
</dependency>
```

### 控制器

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

### 访问接口
  
- 支持的版本

`http://localhost:8080/v2/`

- 不支持的版本
  
`http://localhost:8080/v1/`
