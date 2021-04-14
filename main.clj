(def valor_ascii (int \a))

(defn valor_entero [valor]
  (-(int valor)valor_ascii))

(defn positivo[a b]
  (cond 
  (> a b)(- a b)
  :else (- b a)))

(defn valor_caracter [num]
  (def numero_positivo (positivo num 0))
  (cond (<= numero_positivo 25) (char (+ numero_positivo valor_ascii))
  :else "Ha ocurrido un error"))

(defn numero_corridas[char key]
  (valor_caracter (mod (+ (valor_entero char) key) 26)))

(def mensaje "Hola Mundo")
(def cantidad_corridas 2)

(def codificar (mapv #(numero_corridas % cantidad_corridas)mensaje))
(def resultado (apply str cifrar))

println(str "Mensaje original: " mensaje)
println(str "Mensaje encriptado con el Cifrado Cesar: " resultado)

