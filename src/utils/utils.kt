package utils

import java.io.FileInputStream
import java.io.FileNotFoundException
import java.io.InputStreamReader
import java.nio.charset.StandardCharsets
import java.nio.file.Files
import java.nio.file.Paths

 fun readFile(fileName:String):List<String>{
    val cwd = Paths.get(System.getProperty("user.dir"))
    val resourcesTextPath = Paths.get(cwd.toString(),"resources",
            fileName)
    if (Files.exists(resourcesTextPath)){
        val file = resourcesTextPath.toFile()
        val defaultCharset = StandardCharsets.UTF_8
        val reader = InputStreamReader(FileInputStream(file), defaultCharset)
        reader.use {
            return it.readLines()
        }
    }else throw FileNotFoundException("the file $fileName does not exist!!")
}