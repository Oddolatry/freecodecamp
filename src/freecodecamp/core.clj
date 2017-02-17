(ns freecodecamp.core
  (:require [freecodecamp.landing :as landing]
            [freecodecamp.tribute.core :as tribute]
            [ring.adapter.jetty :as jetty]
            [ring.util.http-response :as response]
            [compojure.core :refer [GET defroutes]]
            [compojure.route :refer [resources not-found]]
            [ring.middleware.reload :refer [wrap-reload]]))

(defn handler
  [req]
  (response/ok (:remote-addr req)))

(defroutes routes
  (GET "/" [] (response/ok (landing/contents)))
  (GET "/tribute" [] (response/ok (tribute/contents)))
  (resources "/")
  (not-found "404 NOT FOUND"))

(defn -main
  [& args]
  (jetty/run-jetty
   (-> #'routes wrap-reload)
   {:port 3000 :join? false}))
