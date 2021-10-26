(defproject fizz-buzz "0.1.0-SNAPSHOT"
  :description "Print Fizz Buzz from 1 to 100."
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :main ^:skip-aot fizz-buzz.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
