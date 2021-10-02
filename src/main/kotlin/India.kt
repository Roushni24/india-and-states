class India {

    val stateList = arrayListOf(
        State("Andhra Pradesh", 9),
        State("Telangana", 8),
        State("Uttar Pradesh", 9)
    )
}

fun main() {
    val india = India()
    val stateList = india.stateList
    stateList.add(State("Kerala", ratingIs = 10) )
    stateList.forEach { state ->
        val title  = state.nameOfState
        val data = "name of the state is $title rated as ${state.ratingIs}"
        println(data)

    }

}