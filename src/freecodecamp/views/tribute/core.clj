(ns freecodecamp.views.tribute.core
  (:require [hiccup.core    :as h]
            [hiccup.page    :as p]
            [hiccup.element :as e]
            [freecodecamp.utils.common :refer [fluid-body
                                               bootstrap-head]]))

;; To Do
;; - Create reusable components
;; - Hammer out some content
;; - Move inline styling / other styling to base.css
;; - See about styling outside of the Bootstrap fluid container

(defn contents
  []
  (bootstrap-head
   (fluid-body
    [:br]
    [:div.row
     [:div.col-md-10.col-md-offset-1.col-sm-10.col-sm-offset-1
      {:style "background:#FCFBE3"} ;; move to base.css
      [:div.row
       [:div.col-md-10.col-md-offset-1.col-sm-10.col-sm-offset-1
        [:h1.text-center "Ada Lovelace"]]]
      [:div.row
       [:div.col-md-10.col-md-offset-1.col-sm-10.col-sm-offset-1
        (e/image
         {:class "center-block img-responsive"
          :style "box-shadow:10px 10px 5px #888"} ;; move to base.css
         "images/tribute/header_ada.jpg")]]
      [:br]
      [:div.row
       [:div.col-md-6.col-md-offset-4.col-sm-6.col-sm-offset-4
        [:blockquote.blockquote-reverse
         [:p "She did an important thing."]
         [:footer "Someone Who Said This in "
          [:cite {:title "This Book"} "This Book"]]]]]
      [:div.row
       [:div.col-md-6.col-md-offset-3.col-sm-8.col-sm-offset-2
        [:p.lead "T" [:small "HE FIRST PROGRAMMER"]]]]
      [:div.row
       [:div.col-md-6.col-md-offset-3.col-sm-8.col-sm-offset-2
        [:p "She did all of these awesome things. Test. She did all of these awesome things. Test. She did all of these awesome things. Test. She did all of these awesome things. Test."]]]
      [:div.row
       [:div.col-md-6.col-md-offset-3.col-sm-8.col-sm-offset-2
        [:p.lead "A" [:small "CCOMPLISHMENTS"]]]]
      [:div.row
       [:div.col-md-6.col-md-offset-3.col-sm-8.col-sm-offset-2
        [:ul
         [:li "List things"]
         [:li "That Are Cool"]]]]]])))
