class PostsController < ApplicationController

def insert
post = Post.new(content: params[:content])
post.save
flash[:notice] = "登録しました"
redirect_to("/")
end
end
