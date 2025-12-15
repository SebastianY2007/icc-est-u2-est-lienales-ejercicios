from sign_validator import SignValidator;

def run_sign_validator():
    signValidator = SignValidator();
    cadena1 = "{[()]}"; # VALIDO
    cadena2 = "{[(])}"; # NO VALIDO

    print("Cadena: " + cadena1 + " es valida? " + str(signValidator.is_valid(cadena1)))    
    print("Cadena: " + cadena2 + " es valida? " + str(signValidator.is_valid(cadena2)))





if __name__ == "__main__":
    run_sign_validator();