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
   
    @posts = Post.all.order(created_at:"desc") #なぜかコロン二個
  end

  def show
    #@id = params[:id] [:id] ={id キー:値}　ハッシュ形式 http://localhost:3000/posts/1 の値が入っている
    @post = Post.find_by(id:params[:id]) #モデル名.find_by（カラム,カラムに対応した値）　対応したDBのレコードを習得してくる
  end

  def new
    @post = Post.new
  end

  def create
    @post = Post.new(content:params[:content])
    @post.save
    if @post.save
      flash[:notice] = "投稿完了しました"
      redirect_to("/posts/index4")#リダイレクト
    else
      render("posts/new")
    end 
  end

  def edit
    @post = Post.find_by(id: params[:id])
  end

  def update
    @post = Post.find_by(id: params[:id])
    @post.content = params[:content]
    if @post.save
      flash[:notice] = "投稿を編集しました"
      redirect_to("/posts/index4")
    else
      render("posts/edit")  
      #render 直接viewを指定する
    end
  end

  def destroy
    @post = Post.find_by(id: params[:id])
    @post.destroy
    flash[:notice] = "削除しました"
    redirect_to("/posts/index4")
  end
end
