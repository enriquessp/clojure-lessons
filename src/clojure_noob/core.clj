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
