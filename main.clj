(defn valor_caracter [numero]
  (def numero_positivo 
  (cond (> numero 0)(- numero 0) :else (- 0 numero)))  
  (cond (<= numero_positivo 25) (char (+ numero_positivo valor_ascii))
  :else "Ha ocurrido un error"))

(defn rotor[char key]
  (def valor_ascii (int \a))
  (valor_caracter (mod (+ (-(int char)valor_ascii) key) 26)))

(def mensaje "Rachit")
(def cantidad_corridas 2)

(def codificar (mapv #(rotor % cantidad_corridas)mensaje))
(def cifrado (apply str codificar))

println(str "Mensaje original: " mensaje)
println(str "Mensaje encriptado con el Cifrado Cesar: " cifrado)