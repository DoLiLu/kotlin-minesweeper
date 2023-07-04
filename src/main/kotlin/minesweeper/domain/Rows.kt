package minesweeper.domain

data class Rows(val value: Int) {
    init {
        require(value > 0) { "너비는 0보다 커야 합니다." }
    }
}
