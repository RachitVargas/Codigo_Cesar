(def valor_ascii (int \a))

(defn valor_caracter [num]
  (def numero_positivo 
  (cond (> num 0)(- num 0) :else (- 0 num)))  
  (cond (<= numero_positivo 25) (char (+ numero_positivo valor_ascii))
  :else "Ha ocurrido un error"))

(defn numero_corridas[char key]
  (valor_caracter (mod (+ (-(int char)valor_ascii) key) 26)))

(def mensaje "Rachit")
(def cantidad_corridas 3)

(def codificar (mapv #(numero_corridas % cantidad_corridas)mensaje))
(def cifrado (apply str codificar))

println(str "Mensaje original: " mensaje)
println(str "Mensaje encriptado con el Cifrado Cesar: " cifrado)
