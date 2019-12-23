Rails.application.routes.draw do
  get 'posts/index'
  get "posts/index2" => "posts#index2"
  get "posts/index3" => "posts#index3"

  
  get "/" =>"home#top"
  #　get url => コントローラー#アクション名
  get "about" => "home#about"
  # For details on the DSL available within this file, see https://guides.rubyonrails.org/routing.html
end
