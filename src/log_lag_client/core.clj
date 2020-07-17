(ns log-lag-client.core)

(def pause 1000)

(defn -main [& args]
  (print (-> *ns* ns-name name))
  (let [logger (org.slf4j.LoggerFactory/getLogger "log-lag-client")]
    (loop [_ (Thread/sleep pause)]
      (.info logger "Ping!")
      (recur (Thread/sleep pause)))))

