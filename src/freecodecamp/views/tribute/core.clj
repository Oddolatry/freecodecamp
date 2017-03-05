(ns freecodecamp.views.tribute.core
  (:require [hiccup.core    :as h]
            [hiccup.page    :as p]
            [hiccup.element :as e]
            [freecodecamp.utils.common :refer [fluid-body
                                               bootstrap-head]]))

;; To Do
;; - Hammer out some content
;; - See about styling outside of the Bootstrap fluid container

(defn row-section-header
  "Embeds `element` between single left and right gutters."
  [element]
  [:div.row
   [:div.col-md-10.col-md-offset-1.col-sm-10.col-sm-offset-1
    element]])

(defn row-section-rev-blockquote
  "Reverse aligned blockquote."
  [quote footer title citation]
  [:div.row
   [:div.col-md-6.col-md-offset-4.col-sm-6.col-sm-offset-4
    [:blockquote.blockquote-reverse
     [:p quote]
     [:footer footer
      [:br]
      [:cite {:title title} (str " " citation)]]]]])

(defn row-section-title
  "Intended to turn all-caps string into lead-cap and small-caps."
  [title]
  (let [[fst & rst] title]
    [:div.row
     [:div.col-md-6.col-md-offset-3.col-sm-8.col-sm-offset-2
      [:p.lead (str fst) [:small (apply str rst)]]]]))

(defn row-section-content
  "Embeds `element` in narrowly guttered column."
  [element]
  [:div.row
   [:div.col-md-6.col-md-offset-3.col-sm-8.col-sm-offset-2
    element]])

(defn contents
  []
  (bootstrap-head
   (fluid-body
    [:br]
    [:div.row
     [:div.col-md-10.col-md-offset-1.col-sm-10.col-sm-offset-1.cream-bg
      (row-section-header [:h1.text-center "Ada Lovelace"])
      (row-section-header (e/image
                           {:class "center-block img-responsive box-shadow-lr"}
                           "images/tribute/header_ada.jpg"))
      [:br]
      (row-section-rev-blockquote
       "That brain of mine is something more than merely mortal, as time will show."
       "Ada Augusta, Countess of Lovelace"
       ""
       "")
      (row-section-title "THE FIRST PROGRAMMER")
      (row-section-content [:p "She did all of these awesome things. Test. She did all of these awesome things. Test. She did all of these awesome things. Test. She did all of these awesome things. Test."])
      (row-section-title "ACCOMPLISHMENTS")
      (row-section-content [:ul
                            [:li "List things"]
                            [:li "That Are Cool"]])]])))
