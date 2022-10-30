package com.weiwei.libs

import java.io.BufferedReader
import java.io.FileInputStream
import java.io.InputStreamReader

fun main(args: Array<String>) {
  if (args.size != 1) {
    throw IllegalArgumentException("Please input lib path!")
  }
  val libPath = args[0]

  val fis = FileInputStream(libPath)
  val br = BufferedReader(InputStreamReader(fis))

  var line: String?
  while (br.readLine().also { line = it } != null) {
    // println(line)
    handleLine(line!!)
  }

  br.close()
}

private val spaceArray: Array<String> = arrayOf(
  "",
  "  ",
  "    ",
  "      ",
  "        ",
  "          ",
  "            ",
)

@Suppress("LocalVariableName")
private fun handleLine(line: String) {
  if (line.contains("implementation")) {
  // if (line.contains("const val") && !line.contains("private const val")) {
    val lineArray = line.split("\"")
    if (lineArray.size == 3) {
      val art = lineArray[1]
      // println(art)
      val arts = art.split(":")
      if (arts.size == 3) {
        val groupId = arts[0]
        val artifactId = arts[1]
        // val version = arts[2]
        // println("groupId = $groupId, artifactId = $artifactId, version=$version")

        val _groupId = groupId.replace("-", "_")
        val _artifactId = artifactId.replace("-", "_")

        val groupArray = _groupId.split(".")

        groupArray.forEachIndexed { index, s ->
          if (index == groupArray.lastIndex) {
            println("${spaceArray[index]}object $s {")
          }else{
            println("${spaceArray[index]}class $s {")
          }
        }

        println("${spaceArray[groupArray.size]}const val $_artifactId = \"$art\"")
        // println("${spaceArray[groupArray.size]}companion object {")
        // println("${spaceArray[groupArray.size + 1]}const val $_artifactId = \"$art\"")
        // println("${spaceArray[groupArray.size]}}")

        for (index in groupArray.lastIndex downTo 0) {
          println("${spaceArray[index]}}")
        }
      } else {
        println(": size < 3")
      }
    } else {
      println("\" size != 3")
    }
  }
}