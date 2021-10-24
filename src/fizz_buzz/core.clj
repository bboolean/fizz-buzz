(ns fizz-buzz.core
  (:gen-class))

(def numbers (range 1 101))

(defn evenly-divisible? [a b]
  (= 0 (rem a b)))

(def fizz-buzz-list
  (map
    (fn [a]
      (str
       (if (evenly-divisible? a 3) "Fizz" "")
       (if (evenly-divisible? a 5) "Buzz" "")
       (if
        (not (or
              (evenly-divisible? a 3)
              (evenly-divisible? a 5)))
         a "")))
    numbers))

(defn -main
  "Print FizzBuzz from 1 to 100"
  [& args]
  (println (clojure.string/join "\n" fizz-buzz-list)))
