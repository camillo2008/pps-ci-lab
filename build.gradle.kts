plugins {
    java
    scala
    jacoco
}


jacoco {
    toolVersion = "0.8.5"
    reportsDir = file("$buildDir/customJacocoReportDir")
}


repositories {
    mavenCentral()
}
dependencies {
    implementation("org.scala-lang:scala-library:2.13.1")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.1.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.1.0")
}


tasks.jacocoTestReport {
    reports {
        xml.isEnabled = false
        csv.isEnabled = false
        html.destination = file("${buildDir}/jacocoHtml")
    }
}



tasks.named<Test>("test"){
    useJUnitPlatform()
}