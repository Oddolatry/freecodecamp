(ns freecodecamp.tribute.core
  (:require [hiccup.core    :as h]
            [hiccup.page    :as p]
            [hiccup.element :as e]))

(defn contents
  []
  (p/html5
   [:head (p/include-css "css/base.css")]
   [:body
    [:p "Sup"]]))
