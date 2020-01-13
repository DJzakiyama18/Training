Rails.application.routes.draw do
  post "user/:id/update" => "user#update"
  get "user/:id/edit" => "user#edit"
  post "user/create" => "user#create"
  get 'user/index'
  get "user/new" => "user#new"
  get "user/:id" => "user#show"

  get 'posts/index'#ルーティングは上から順に実行されていく
  get "posts/index2" => "posts#index2"
  get "posts/index3" => "posts#index3"
  get "posts/index4" => "posts#index4"
  get "posts/new"    => "posts#new"
  get "posts/:id"    => "posts#show" #:id = postsテーブルのidを参照
  post "posts/create" => "posts#create" # データベースと接続する時は　post を使う
  get "posts/:id/edit" => "posts#edit"
 post "posts/:id/update" => "posts#update"
 post "posts/:id/destroy" => "posts#destroy"

  
  get "/" =>"home#top"
  #　get url => コントローラー#アクション名
  get "about" => "home#about"
  # For details on the DSL available within this file, see https://guides.rubyonrails.org/routing.html
end
