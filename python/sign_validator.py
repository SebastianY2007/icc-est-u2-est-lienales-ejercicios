class SignValidator:

    def is_valid(self, text: str) -> bool:
        stack = []
        pares = {
            ')': '(',
            ']': '[',
            '}': '{'    
        }

        for char in text:
            if char == '(' or char == '{' or char == '[':
                stack.append(char)
            elif char == ')' or char == '}' or char == ']':
                if not stack:
                    return False
                # Aunque pase si no está vacío?
                # comparo el char con el ultimo de la pila
                # si son del mismo tipo saco y avanzo
                # si son de otro return FALSE

                ultimo = stack.pop()

                if pares[char] != ultimo:
                    return False

        return len(stack) == 0