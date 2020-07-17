(defproject log-lag-client "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 ;; Use Logback as the main logging implementation:
                 [ch.qos.logback/logback-classic "1.2.3"]
                 [ch.qos.logback/logback-core "1.2.3"]

                 ;; Logback implements the SLF4J API:
                 [org.slf4j/slf4j-api "1.7.22"]

                 ;; [ch.qos.logback/logback-classic "1.2.3"]
                 [net.logstash.logback/logstash-logback-encoder "6.4"]
                 [org.clojure/tools.cli "1.0.194"]]

  :main log-lag-client.core

  :profiles {:dev     {:plugins      [[lein-shell "0.5.0"]]
                       :dependencies [[org.clojure/tools.namespace "1.0.0"]
                                      [org.clojure/tools.trace "0.7.10"]]}
             :uberjar {:aot :all}}
  :aliases {"build-native"
            ["shell"
             "native-image" "--report-unsupported-elements-at-runtime"
             "--initialize-at-build-time"
             "-jar" "./target/${:uberjar-name:-${:name}-${:version}-standalone.jar}"
             "-H:Name=./target/${:name}"]}
  :repl-options {:init-ns log-lag-client.core})
