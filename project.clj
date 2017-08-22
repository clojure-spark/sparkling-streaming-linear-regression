(defproject sparkling-16-ml "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [gorillalabs/sparkling "1.2.3"]
                 [yieldbot/flambo "0.8.2"]
                 [org.apache.spark/spark-mllib_2.10 "1.6.0"]
                 [org.apache.spark/spark-streaming_2.10 "1.6.0"]
                 [org.apache.spark/spark-streaming-kafka_2.10 "1.6.3"]
                 [org.apache.spark/spark-streaming-flume_2.10 "1.6.1"]]
  :aot [#".*" sparkling.serialization sparkling.destructuring sparkling-16-ml.core]
  :main sparkling-16-ml.streaming-bayes
  :profiles {:provided {:dependencies [[org.apache.spark/spark-core_2.10 "1.6.0"]]}
             :dev {:plugins [[lein-dotenv "RELEASE"]]}}
  :java-source-paths ["src/java"])
