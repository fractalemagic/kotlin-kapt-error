import dagger.ObjectGraph

fun main(vararg args: String) {
	val module = DaggerModule()
	val objectGraph = ObjectGraph.create(module)
	val dependency = objectGraph.get(Dependency::class.java)
	println("Successfully retrieved $dependency")
}
