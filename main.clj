(def valor_ascii (int \a))

(defn positivo[a b]
(if (> a b) (- a b) (- b a)))

(defn valor_entero [valor]
  (- (int valor) valor_ascii))

(defn valor_caracter [num]
  (def numero_p (positivo num 0))
  (if (<= numero_p 25)(char (+ numero_p valor_ascii))))

(defn numero_corridas
  [char key]
  (valor_caracter (mod (+ (valor_entero char) key) 26)))

(def encriptar (mapv #(numero_corridas % 2) "mario"))
(def resultado (apply str encriptar))

println(str "Cifrado cesar: " resultado)
