(ns freecodecamp.core
  (:require [freecodecamp.views.landing      :as landing]
            [freecodecamp.views.tribute.core :as tribute]
            [ring.adapter.jetty              :as jetty]
            [ring.util.http-response         :as response]
            [compojure.core                  :refer [GET defroutes]]
            [compojure.route                 :refer [resources not-found]]
            [ring.middleware.reload          :refer [wrap-reload]]))

(defroutes routes
  (GET "/" [] (response/ok (landing/contents)))
  (GET "/tribute" [] (response/ok (tribute/contents)))
  (resources "/")
  (not-found "404 NOT FOUND"))

(defn -main
  [& args]
  (jetty/run-jetty
   (wrap-reload #'routes)
   {:port 3000 :join? false}))
