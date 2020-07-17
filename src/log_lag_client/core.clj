(ns log-lag-client.core
  (:gen-class))

(def pause 1000)

(defn -main [& args]
  (print (-> *ns* ns-name name))

  (let [name (if-let [name (System/getenv "LOGGER_NAME")]
               name
               "log-lag-client")
        logger (org.slf4j.LoggerFactory/getLogger name)]
    (loop [_ (Thread/sleep pause)]
      (.info logger "Ping!")
      (recur (Thread/sleep pause)))))

