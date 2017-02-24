(ns freecodecamp.landing
  (:require [hiccup.core    :as h]
            [hiccup.page    :as p]
            [hiccup.element :as e]))

(defn contents
  []
  (p/html5
   [:head
    [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}]
    [:title "freeCodeCamp Project Landing"]
    (p/include-css "css/bootstrap.css")
    (p/include-js  "js/bootstrap.js")] ;; need jquery
   [:body
    [:div.container-fluid
     [:div.row
      [:div.col-md-6.col-md-offset-1
       [:h1 "freeCodeCamp Project Navigation"]]]
     [:div.row
      [:div.col-md-11.col-md-offset-2 (e/link-to "/tribute" "Tribute Page")]
      [:div.col-md-11.col-md-offset-2 "Sup"]]]]))
