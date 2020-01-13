class UserController < ApplicationController
  def index
    @users = User.all
  end

  def show
    @user = User.find_by(params[:id])
  end

  def new
    @user = User.new
  end

  def create
    @user = User.new(name: params[:name], email: params[:email])
    if @user.save
      redirect_to("/user/#{user.id}")
    else
      render("user/new")
    end 
  end

  def edit
    @user = User.find_by(id: params[:id])
  end

  def update
    @user = User.find_by(id: params[:id])
    @user.name = params[:name]
    @user.email = params[:email]
    if @user.save
      flash[:notice] = "編集が完了しました"
      redirect_to("/user/#{@user.id}") 
    else
      render("user/edit") 
    end
  end

end
