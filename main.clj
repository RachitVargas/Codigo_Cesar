(def valor_ascii (int \a))

(defn valor_entero [valor]
  (- (int valor) valor_ascii))

(defn positivo[a b]
(cond 
(> a b)(- a b)
:else (- b a)))

(defn valor_caracter [num]
  (def numero_p (positivo num 0))
  (cond (<= numero_p 25) (char (+ numero_p valor_ascii))
  :else "Ha ocurrido un error"))

(defn numero_corridas[char key]
  (valor_caracter (mod (+ (valor_entero char) key) 26)))

(def cifrar (mapv #(numero_corridas % 2)"Rachit Vargas"))
(def resultado (apply str cifrar))

println(str "Cifrado cesar: " resultado)
