package de.kern.kotlincacheintellijissue

import org.springframework.boot.fromApplication
import org.springframework.boot.with


fun main(args: Array<String>) {
    fromApplication<KotlinCacheIntellijIssueApplication>().with(TestcontainersConfiguration::class).run(*args)
}
