(ns freecodecamp.utils.common
  (:require [hiccup.core    :as h]
            [hiccup.page    :as p]
            [hiccup.element :as e]))

(defn bootstrap-head
  [body]
  (p/html5
   [:head
    [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}]
    [:title "freeCodeCamp Project Landing"]
    (p/include-css "css/bootstrap.css")
    (p/include-css "css/base.css")
    (p/include-js  "js/bootstrap.js")] ;; need jquery
   body))

(defn fluid-body
  [& body]
  (conj [:body]
        (into [:div.container-fluid] body)))
