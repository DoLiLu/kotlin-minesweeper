package minesweeper.view

object InputView {
    fun requestPositiveNumber(): Int {
        val input: String = requestString()
        val number = input.toIntOrNull()

        require(number != null) { "숫자를 입력 해주세요." }
        require(number > 0) { "양수를 입력 해주세요." }

        return number
    }

    private fun requestString(): String {
        val input = readlnOrNull()
        require(!input.isNullOrBlank()) { "빈값을 입력 할 수 없습니다." }

        return input
    }
}