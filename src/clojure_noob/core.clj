(ns clojure-noob.core
  (:gen-class))

(def failed-protagonist-names ["Larry Poter" "Dorren the Explorer"])

(defn -main
  "I'm a little teapot!"
  [& args]
  (println (str "Hello, World " " Concat ")))

(defn if-sample
  "THis is a function evaluaing an if structure"
  []
  (if true
    "This is true"
    "This is the else"))

(defn if-sample-multiple-statements
  ""
  []
  (if false
    (do (println "First statement")
        (println "Again")
        "in case of true return this")
    (do (println "Second statement")
        (println "Again")
        "in case of false return this"))
  )

(defn when-sample
  "Function comment"
  []
  (when (= 1 1)
    (println failed-protagonist-names)
    "Return this string"))

(defn nil-checking
  "Function comment"
  [anything]
  (when (nil? anything)
    "Return this string"))

(defn or-checking
  "Function comment"
  [param]
  (if (or (= 0 1) (nil? param))
    "It is true"
    "Else it is false"))

(defn and-checking
  "Function comment"
  [param]
  (if (and (= 1 1) (nil? param))
    "It is true"
    "Else it is false"))

(def person-map {:name "Enrique" :lastname "Pereira" :age 39 :phone {:ddd 11 :number "1234-5678"}})

(defn print-last-name
  "Printing lastname of a person map using 'get' function"
  [person]
  (println (get person :lastname)))

(defn print-person-phonenumber
  "Printing inner element attribute using 'get-in' function"
  [person]
  (println (get-in person [:phone :number])))

(defn print-person-name
  "Printn person name treating the map as a function"
  [person]
  (println (person :name)))

(defn print-person-age
  "Printn person age using keyword as a function"
  [person]
  (println (:age person "default value")))

(def first-vector [1 "a string" {:color "blue"}])

(defn print-color-map
  "Get the map using get and index"
  [values]
  (println (get values 2)))

(defn add-person-map-to-vector
  "Add a person to the vector. This create another vector."
  [values]
  (println (conj values person-map)))

(def first-list '(1 2 3 "a string"))

(defn print-first-element-list
  "Function comment"
  [values]
  (println (nth values 0)))

(defn add-person-map-to-list
  "Function comment"
  [values]
  (println (conj values person-map)))

(def first-hashset (hash-set 1 1 2 2))

(defn check-contains-value
  "Function comment"
  [values value]
  (println (contains? values value)))

(def numbers [0 1 2 3])

(defn add-one-to-values
  "Function comment"
  [values]
  (println (map inc values)))

(defn multi-arity
  "Describing something using arity(argument) overloading"
  ([verb subject]
   (println (str "I " verb " in " subject)))
  ([subject]
   (multi-arity "program" subject)))

(defn coder-communication
  "Simple function just printing something"
  [value]
  (println (str "I'm printing this " value)))

(defn coder
  "Example of a function receiving N params (rest parameter)"
  [& values]
  (map coder-communication values))


;; A comment in clojure
(defn favorite-things
  "Mixing a param and a rest param"
  [name & things]
  (println (str "Hi, " name " here are my favorite things: "
                (clojure.string/join "," things))))

;; Destructuring

(defn chooser
  "Example of a destructuring of a vector"
  [[first-element second-element & the-rest]]
  (println (str "Your first element is " first-element))
  (println (str "Your second element is " second-element))
  (println (str "The rest is not important. Just in case let us print it:"
                (clojure.string/join "," the-rest))))

(defn chooser-map
  "Example of a destructuring of a map"
  [{lat :lat long :long}]
  (println (str "The lat is " lat "and long is " long)))


;;Anonymous function

(defn first-anon-function
  [values]
  (map (fn [v] (println (str "Hi mr " v))) values ))

(defn second-anon-function
  [values]
  (map #(println (str "Hi mr " %)) values))







