class PostsController < ApplicationController

  def index
   
  end

  def index2
    
  end

  def index3
    
    @post1 = "zakiyama"
    @post2 = "makoto"
    #@変数名　で対応するviewに出力できる
    #view でも@をつけ忘れない
  end

  def index4
   
    @posts = Post.all
  end
end
