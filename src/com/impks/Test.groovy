package com.impks

class Test {
    static void main(String [] args) {
        println "Test!"
        def demo = new Expando()
        demo.metaClass.propOne = "propOne"
        demo.metaClass.propTwo = "propTwo"
        println "demo.propOne: " + demo.propOne
        println "demo.propTwo: " + demo.propTwo
        demo.metaClass.methodOne() { argOne, argTwo ->
            println "argOne: " + argOne + " argTwo: " + argTwo
        }
        demo.methodOne("argOne","argTwo")
    }
}
