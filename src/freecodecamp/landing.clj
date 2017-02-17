(ns freecodecamp.landing
  (:require [hiccup.core    :as h]
            [hiccup.page    :as p]
            [hiccup.element :as e]))

(defn contents
  []
  (p/html5
   [:head (p/include-css "css/base.css")]
   [:body
    [:div.splash "freeCodeCamp Project Navigation"]
    [:div (e/link-to "/tribute" "Tribute Page")]]))
