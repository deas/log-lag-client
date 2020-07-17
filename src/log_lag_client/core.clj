(ns log-lag-client.core
  ;; (:require [clojure.java.io :as io]))
  )

;; (set! *warn-on-reflection* true)

(def pause 1000)

(defn -main [& args]
  (let [logger (org.slf4j.LoggerFactory/getLogger (-> *ns* ns-name name))]
    #_(println "foobar")
    (loop [_ (Thread/sleep pause)]
      (.info logger "Ping")
      (recur (Thread/sleep pause))))
  )

