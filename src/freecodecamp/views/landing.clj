(ns freecodecamp.views.landing
  (:require [hiccup.core    :as h]
            [hiccup.page    :as p]
            [hiccup.element :as e]
            [freecodecamp.utils.common :refer [bootstrap-head]]))

(defn contents
  []
  (bootstrap-head
   [:body
    [:div.container-fluid
     [:div.row
      [:div.col-md-12.col-md-offset-1
       [:h1 "freeCodeCamp Project Navigation"]]]
     [:div.row
      [:div.col-md-12.col-md-offset-2 (e/link-to "/tribute" "Tribute Page")]
      [:div.col-md-12.col-md-offset-2 "Sup"]]]]))
