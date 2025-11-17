# PlanetLib — Универсальная библиотека для Nukkit

[![Kotlin](https://img.shields.io/badge/Kotlin-2.2.21-blue)](https://kotlinlang.org)
[![Lumi](https://img.shields.io/badge/Lumi-1.3.x%2B-orange)](https://github.com/KoshakMineDEV/Lumi)
[![License](https://img.shields.io/badge/Java-21+-green)](https://www.java.com/ru/)
[![License](https://img.shields.io/badge/License-MIT-yellow)](LICENSE)

---

**PlanetLib** — это **единая библиотека** для плагинов **Nukkit-MOT/Lumi**.  


Добавляет на ваш сервер Kotlin, базы данных, JSON, кэши — **всё в одном JAR**.

---

## Зачем это нужно?

| Проблема              | Решение с PlanetLib |
|-----------------------|---------------------|
| Дубликация JVM Kotlin | **Тут уже есть все библиотеки**
| Конфликты версий      | **Relocations** |
| Долгая загрузка       | **Shade + минимизация** |
| Хаки между плагинами  | **Единый API** |


## Что внутри?

| Библиотека | Версия | Назначение |
|----------|--------|----------|
| Kotlin | 2.2.21 | Язык |
| Coroutines | 1.10.2 | Асинхронность |
| Serialization | 1.9.0 | JSON |
| HikariCP | 6.2.1 | Базы данных |
| MySQL | 8.0.33 | MySQL |
| SQLite | 3.41.2.2 | SQLite |
| Adventure | 4.17.0 | Текст |
| Gson | 2.10.1 | JSON |
| JsonPath | 2.9.0 | Парсинг |
| Caffeine | 3.1.8 | Кэш |
| SLF4J | 2.0.17 | Логи |


## Установка

1. Положи `PlanetLib-0.1.jar` в `/plugins/`
2. Перезагрузи сервер
3. Kotlin загрузится автоматически и все модули такие как MySQL/SQLite/Gson... Тоже будут работать.

---

## Для разработчиков

### Подключение в `pom.xml`

```xml
<dependency>
    <groupId>ru.planetpe.planetlib</groupId>
    <artifactId>PlanetLib</artifactId>
    <version>0.1</version>
    <scope>provided</scope>
</dependency>

```

## Больше плагинов в Telegram: 
> Плагины для Nukkit/Lumi/PocketMine-MP
> 
> https://t.me/planetpe 

## Лицензия

[MIT License](LICENSE) — используй, модифицируй, продавай.


