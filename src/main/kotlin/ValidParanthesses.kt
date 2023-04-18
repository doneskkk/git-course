fun main() {
    print(isValid("[[]]"))
}


    // Isn't working :(

    fun isValid(s: String): Boolean {
        val stack = mutableListOf<Char>()
        val map = hashMapOf(')' to '(', '}' to '{', '[' to ']')
        for(c in s) {
            if (map.containsKey(c)) {
                if (stack.isEmpty() || stack.removeLast() != map[c]) {
                    return false
                }
            } else {
                stack.add(c)
            }
        }
        return stack.isEmpty()

    }

