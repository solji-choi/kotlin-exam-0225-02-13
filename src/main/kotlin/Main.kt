package com.ll

import java.io.File
import java.nio.file.Files

fun main() {
    copy("a.txt", "a_copy.txt")
}

fun copy(source: String, target: String) {
    Files.copy(File(source).toPath(), File(target).toPath(), StandardCopyOption.REPLACE_EXISTING)
}