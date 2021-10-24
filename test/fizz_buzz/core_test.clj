(ns fizz-buzz.core-test
  (:require [clojure.test :refer :all]
            [fizz-buzz.core :refer :all]))

(def to-index #(- %1 1))

(deftest numbers-test
  (testing "numbers"
    (is (=
         5
         (nth fizz-buzz.core/numbers (to-index 5))))))

(deftest evenly-divisible?-test
  (testing "evenly-divisible?"
    (is (=
         true
         (fizz-buzz.core/evenly-divisible? 3 3)))
    (is (=
         false
         (fizz-buzz.core/evenly-divisible? 4 3)))
    (is (=
         true
         (fizz-buzz.core/evenly-divisible? 15 5)))))

(deftest fizz-buzz-list-test
  (testing "fizz-buzz-list"
    (is (=
         "1"
         (nth fizz-buzz.core/fizz-buzz-list (to-index 1))))
    (is (=
         "Fizz"
         (nth fizz-buzz.core/fizz-buzz-list (to-index 3))))
    (is (=
         "Buzz"
         (nth fizz-buzz.core/fizz-buzz-list (to-index 5))))
    (is (=
         "FizzBuzz"
         (nth fizz-buzz.core/fizz-buzz-list (to-index 15))))))
